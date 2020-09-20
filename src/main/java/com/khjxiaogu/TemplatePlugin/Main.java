package com.khjxiaogu.TemplatePlugin;

import com.khjxiaogu.TemplatePlugin.PluginData;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.console.plugin.jvm.SimpleJvmPluginDescription;

// TODO: Auto-generated Javadoc
/**
 * 插件主类
 * @author khjxiaogu
 * file: MiraiSongPlugin.java
 * time: 2020年8月26日
 */
public class Main extends JavaPlugin{
	public Main() {
		super(new JvmPluginDescriptionBuilder(PluginData.id,PluginData.version).name(PluginData.name).author(PluginData.author).info(PluginData.info).build());
	}
	@Override
	public void onEnable() {
		getLogger().info("插件加载完毕!");
	}

}
