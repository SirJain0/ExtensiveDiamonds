package sirjain.extensivediamonds.block.gem_charger;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import sirjain.extensivediamonds.block.gem_charger.entity.GemChargerBlockEntity;
import sirjain.extensivediamonds.block.gem_charger.entity.ModBlockEntities;

public class GemChargerBlock extends BlockWithEntity implements BlockEntityProvider {
	public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

	public GemChargerBlock(Settings settings) {
		super(settings);
	}

	private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 25, 16);

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}

	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}

	@Override
	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return state.with(FACING, rotation.rotate(state.get(FACING)));
	}

	@Override
	public BlockState mirror(BlockState state, BlockMirror mirror) {
		return state.rotate(mirror.getRotation(state.get(FACING)));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Override
	public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof GemChargerBlockEntity) {
				ItemScatterer.spawn(world, pos, (GemChargerBlockEntity) blockEntity);
				world.updateComparators(pos, this);
			}
			super.onStateReplaced(state, world, pos, newState, moved);
		}
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);
		if (world.isClient || screenHandlerFactory == null) return ActionResult.PASS;
		player.openHandledScreen(screenHandlerFactory);

		return ActionResult.SUCCESS;
	}

	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockPos blockPos, BlockState blockState) {
		return new GemChargerBlockEntity(blockPos, blockState);
	}

	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
		return validateTicker(type, ModBlockEntities.GEM_CHARGER, GemChargerBlockEntity::tick);
	}
}