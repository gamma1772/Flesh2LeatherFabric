/*
 * This file is part of Flesh 2 Leather, licensed under the MIT License (MIT)
 *
 * Copyright (C) 2020
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.codenamerevy.flesh2leather;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Flesh2Leather implements ModInitializer
{

    public static final String MODID = "flesh2leather";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static Flesh2Leather INSTANCE;
    public static final Item COMBINED_FLESH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    @Override
    public void onInitialize()
    {
        INSTANCE = this;
        Registry.register(Registry.ITEM, new Identifier(MODID, "combined_flesh"), COMBINED_FLESH);
        LOGGER.info("Flesh 2 Leather setup complete!");
    }
}
