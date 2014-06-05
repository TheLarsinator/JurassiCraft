package com.ilexiconn.jurassicraft.data.item;

import com.ilexiconn.jurassicraft.Util;
import net.minecraft.item.Item;

public class ItemFossil extends Item
{
    public ItemFossil()
    {
        super();
        setUnlocalizedName("fossil");
        setTextureName(Util.getModId() + "fossil");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
