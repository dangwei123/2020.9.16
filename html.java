<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>内联框架</title>
</head>
<body>

<iframe src="" name="tmp" frameborder="0" width="500" height="300"></iframe>
<br/>
<a href="https://www.baidu.com" target="tmp">点击跳转</a>

</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>列表标签</title>
</head>
<body>

<h2>有序列表</h2>
<ol>
    <li>java</li>
    <li>c</li>
    <li>c++</li>
</ol>


<h2>无序列表</h2>
<ul>
    <li>java</li>
    <li>c</li>
    <li>c++</li>
</ul>

<!--
    dt:标题
    dd:内容
-->
<h2>自定义列表</h2>
<dl>
    <dt>自定义</dt>
    <dd>java</dd>
    <dd>c</dd>
    <dd>c++</dd>
</dl>



</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>图像</title>
</head>
<body>

<!--
     src：路径，建议使用相对路径
     alt：图像名称，如果图像加载不出来就显示该文字
     title：悬停文字
     width：宽度
     height：高度
-->
<img src="../resources/image/qq.jpg" alt="桌面图像" title="悬停文字" width="500" height="300">
<br/>
<img src="../resources/image/qq.jpg" alt="桌面图像" title="悬停文字" width="500" height="300">
<br/>
<img src="../resources/image/qq.jpg" alt="桌面图像" title="悬停文字" width="500" height="300">
<br/>
<img src="../resources/image/qq.jpg" alt="桌面图像" title="悬停文字" width="500" height="300">
<br/>
<img src="../resources/image/qq.jpg" alt="桌面图像" title="悬停文字" width="500" height="300">
<br/>
<img src="../resources/image/qq.jpg" alt="桌面图像" title="悬停文字" width="500" height="300">
<br/>

<a name="down">我是底部</a>
</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="冲鸭">
    <title>第一个网页</title>
</head>

<body>

<!--标题标签-->
<h1>一级标签</h1>
<h2>二级标签</h2>
<h3>三级标签</h3>
<h4>四级标签</h4>
<h5>五级标签</h5>
<h6>六级标签</h6>

<hr/>
<!--段落标签-->
<p>第一段</p>
<p>第二段</p>
<p>第三段</p>

<hr/>
<!--换行标签-->
第一段<br/>
第二段<br/>
第三段<br/>

<!--水平线标签-->
<hr/>


粗体标签：<strong>我是粗体</strong><br/>
斜体标签：<em>我是斜体</em>

<hr/>

<h1>特殊符号</h1>

空&nbsp;&nbsp;&nbsp;&nbsp;格：<br/>
大于：&gt;<br/>
小于：&lt;<br/>
大于等于：&ge;<br/>
小于等于：&le;<br/>




</body>

</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>媒体标签</title>
</head>
<body>

<video src="../resources/video/雨.mp4" controls autoplay="true"></video>

<!--<audio src="../resources/audio/化身孤岛的鲸.mp3" controls autoplay></audio>-->

</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>表单</title>
</head>
<body>
<h1>注册账号</h1>

<form method="get" action="基础标签.html">
    <p>账号:<input type="text" name="username" placeholder="请输入账号"></p>
    <p>密码：<input type="password" name="pwd" placeholder="请输入密码"></p>

    <!--单选框-->
    <p>性别：
        <input type="radio" name="sex" value="boy"/>男
        <input type="radio" name="sex" value="girl"/>女
    </p>

    <!--多选框-->
    <p>爱好：
        <input type="checkbox" name="hobby" value="sleep">睡觉
        <input type="checkbox" name="hobby" value="study">学习
        <input type="checkbox" name="hobby" value="eat">吃

    </p>
    <p>
        <input type="submit" value="提交">
        <input type="reset" value="重置" >
    </p>


    <!--下拉框-->
    <p>国家：
        <select name="country">
            <option value="china">中国</option>
            <option value="yindu">印度</option>
            <option value="america">美国</option>
        </select>
    </p>

    <!--文本域-->
    <p>意见反馈：
        <textarea name="textarea" cols="50" rows="10"></textarea>
    </p>


    <!--上传文件-->
    <p>
        <input type="file" name="file">
    </p>


    <p>剩余数量：
        <input type="number" name="number" max="100" min="0" step="1" value="0">
    </p>

    <p>
        <input type="image" src="../resources/image/qq.jpg" width="500" height="300">
    </p>

    <p>音量大小：
        <input type="range" name="voice" max="100" min="0" step="2" value="50">
    </p>
</form>


</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>表格标签</title>
</head>
<body>
<!--
    border:加边框
    tr:行
    td:列
    colspan:列合并
    rowspan:行合并
-->
<table border="1px" >
    <tr>
        <td colspan="3">学生成绩</td>
    </tr>
    <tr>
        <td rowspan="2">张三</td>
        <td>语文</td>
        <td>100</td>
    </tr>
    <tr>
        <td>数学</td>
        <td>100</td>
    </tr>
    <tr>
        <td rowspan="2">李四</td>
        <td>语文</td>
        <td>99/td>
    </tr>
    <tr>
        <td>数学</td>
        <td>99</td>
    </tr>
</table>


</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>超链接</title>
</head>
<body>

<a name="top">我是顶部</a><br/>
<a href="#down">跳转到底部</a><br/>
<!--
    target:在哪打开
           _blank 在新页面中打开
           _self  在本页面中打开(默认)
-->
<a href="https://www.baidu.com" target="_blank">点击跳转百度</a>
<hr/>

<a href="图像标签.html">点击跳转图像</a>
<hr/>


<h1>图片跳转</h1>
<a href="https://www.baidu.com">
    <img src="../resources/image/qq.jpg" alt="图像" title="小人" width="500" height="300">
</a>
<h1>图片跳转</h1>
<a href="https://www.baidu.com">
    <img src="../resources/image/qq.jpg" alt="图像" title="小人" width="500" height="300">
</a><h1>图片跳转</h1>
<a href="https://www.baidu.com">
    <img src="../resources/image/qq.jpg" alt="图像" title="小人" width="500" height="300">
</a><h1>图片跳转</h1>
<a href="https://www.baidu.com">
    <img src="../resources/image/qq.jpg" alt="图像" title="小人" width="500" height="300">
</a>


<hr/>
<!--
     锚链接：比如：跳转到顶部
     通过<a name=""></a>定义一个标志
-->

<a href="#top">回到顶部</a>

<hr/>

<a href="图像标签.html#down" target="_blank">点击跳转到另一个网页的底部</a>

<br/>

<a name="down">我是底部</a>



<hr/>
<h1>功能性链接</h1>
<h3>发邮件</h3>
<a href="mailto:dang_chongya@163.com">发邮件</a><br/>

</body>
</html>