<template>
  <div id="building">
    <router-view></router-view>
  </div>

</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
  #building{
    width: 100%;
    min-height: 100vh;
    background:url("./assets/img/1001.png"); center: center no-repeat;
    background-size: 100% 100%;
    position: fixed;
  }
  body{
    margin:0;
    padding:0;
    border:0
  }
</style>
