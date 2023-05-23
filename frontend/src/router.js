
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import HelloManager from "./components/listers/HelloCards"
import HelloDetail from "./components/listers/HelloDetail"

import WorldManager from "./components/listers/WorldCards"
import WorldDetail from "./components/listers/WorldDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/hellos',
                name: 'HelloManager',
                component: HelloManager
            },
            {
                path: '/hellos/:id',
                name: 'HelloDetail',
                component: HelloDetail
            },

            {
                path: '/worlds',
                name: 'WorldManager',
                component: WorldManager
            },
            {
                path: '/worlds/:id',
                name: 'WorldDetail',
                component: WorldDetail
            },



    ]
})
