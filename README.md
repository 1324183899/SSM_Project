> 本开源项目计划采用技术：idea+maven+ssm+redis+SUI+JQuery
>
> 项目仅供实战练习
>
> @Author Dylan QQ:13241838399

# 开发注意事项：

-  前端代码请放到本项目的web/WEB-INF/html目录下。建议:针对不同的模块，根据功能或者模块不同的，建议在web/WEB-INF/html目录下创建多个子目录对其进行划分。其它相关信息请见    web/index.html的内容。(可以自行选择框架)

- 下面的操作是在假设你已将源仓库的代码克隆到了本地的情况下：

  - 关于源仓库和本地仓库的同步：如果源仓库内容相比之前有所修改，你需要及时的与源仓库内容同步。具体方法如下：

  ​                           1.git fetch 源仓库名 要拉取的源仓库的分支

  ​                             //比如 git fetch origin master   表示从源仓库origin下抓取其master分支到本地。

  ​                            2.git  merge 源仓库名 刚刚抓取的分支

  ​                             //比如 git merge origin master 表示将刚刚从源仓库origin下抓取的master分支与本地master分支合并。            

  - 关于源仓库和自己的github远程仓库的同步：

      源仓库与自己的github远程仓库同步之前，你需要先将本地仓库与源仓库同步，具体操作上面已经提到。在本地仓库与源仓库同步后，执行命令：” git push 你的github仓库名 master:想推送到github仓库的哪个分支下。“    比如 git push origin master:develop    意味着你将本地master分支推送到你github远程仓库的develop下。

    ------

    ## 如果对github还不清楚的朋友可以参考我的csdn博文：

   [https://blog.csdn.net/qq_43426885/article/details/104267826](https://blog.csdn.net/qq_43426885/article/details/104267826)