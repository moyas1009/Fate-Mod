package com.moyas1009.fatemod.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class AltarBlock extends BlockBase implements ITileEntityProvider{

	public AltarBlock(String name, Material material) 
	{
		super(name, material);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityAltarBlock();
	}

}
