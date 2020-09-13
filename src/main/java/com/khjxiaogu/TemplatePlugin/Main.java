package com.khjxiaogu.TemplatePlugin;

import com.khjxiaogu.TemplatePlugin.PluginData;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
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
		super(new SimpleJvmPluginDescription(PluginData.name,PluginData.version,PluginData.author,PluginData.info));
	}
	@Override
	public void onEnable() {
		
		getLogger().info("插件加载完毕!");
	}

}
