package sirjain.extensivediamonds.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EDDiamondBlock extends ExperienceDroppingBlock {
	private final int amplifier;
	private final StatusEffect steppedEffect;

	public EDDiamondBlock(Settings settings, int amplifier, StatusEffect steppedEffect) {
		super(settings);
		this.amplifier = amplifier;
		this.steppedEffect = steppedEffect;
	}

	public void onSteppedOn(World world, BlockPos blockPos, BlockState blockState, Entity steppedEntity) {
		if (!world.isClient && steppedEntity instanceof LivingEntity entity) {
			entity.addStatusEffect(new StatusEffectInstance(steppedEffect, 3 * 20, amplifier));
		}

		super.onSteppedOn(world, blockPos, blockState, steppedEntity);
	}
}