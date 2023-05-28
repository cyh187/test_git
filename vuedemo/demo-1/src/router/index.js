import Vue from 'vue'
import VueRouter from 'vue-router'
import Book from "../views/Book.vue";
import home from "../views/home.vue";
//这里导入我们刚创建的Book


Vue.use(VueRouter)
Vue.use(home)
const routes = [

  //这里，导入用到Book
  {
    path: '/home',
    name: 'home',
    component: home
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router



