<template>
    <div id="login" align="center">
        <h3 style="color: aliceblue">在线考试系统</h3>
        <h4 style="color: aliceblue">登录</h4>
        <br><br><br>
        <form action="">
            <div class="name">
                <label style="color: aliceblue">昵称 :</label>
                <input type="text" name="name" v-model.trim="name" >
            </div>
            <br>
            <div class="password">
                <label style="color: aliceblue">密码 :</label>
                <input type="text" name="password" v-model.trim="password">
            </div>
            <br>
            <div class="user">
              <input type="radio" id="student" value="0"
                     name="user">
              <label for="student" style="color: aliceblue">学生</label>
              <input type="radio" id="teacher" value="0"
                     name="user">
              <label for="teacher" style="color: aliceblue">教师</label>
            </div>
            <br>
            <div class="submit">
                <button>登录</button>
                <button>注册</button>
            </div>

        </form>

    </div>
</template>

<script>

  export default {
    name: "home",

  }

</script>

<style scoped>
  #login{
    width:360px;
    height:400px;
    margin-left:450px;
    margin-top:100px;
    opacity: 0.55;
    background: url("../assets/img/1002.png");
  }
  body{
    margin:0;
    padding:0;
    border:0
  }
</style>
