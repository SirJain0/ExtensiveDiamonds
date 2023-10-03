package sirjain.extensivediamonds.block.ore_blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockOfGreenDiamond extends ExperienceDroppingBlock {
	public BlockOfGreenDiamond(Settings settings) {
		super(settings);
	}

	public void onSteppedOn(World world, BlockPos blockPos, BlockState blockState, Entity entity) {
		if (!world.isClient) {
			((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 3 * 20, 1));
		}

		super.onSteppedOn(world, blockPos, blockState, entity);
	}
}
