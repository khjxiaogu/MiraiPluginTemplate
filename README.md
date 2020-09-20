# mirai插件模板
用于快速生成mirai java插件，IDE为eclipse。  
# 食用方法
0. 使用模板创建git项目。(点击github页面的绿色按钮Use this template，然后跟着向导创建项目。)  
1. git clone到本地。  
2. 打开pom.xml，找到properties，修改mirai.plugin.main到你的主类，mirai.plugin.author到你的名称，同时修改groupId artifactId name description等设置。  
3. 修改src/main/java-templates和src/main/java里的包名为你需要的包名。  
4. 在Main.java里面写插件。  
