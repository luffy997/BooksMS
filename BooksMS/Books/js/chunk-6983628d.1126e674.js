(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-6983628d"],{9939:function(t,a,n){"use strict";var e=n("e857"),i=n.n(e);i.a},a82f:function(t,a,n){"use strict";n.r(a);var e=function(){var t=this,a=t.$createElement,n=t._self._c||a;return n("div",{staticClass:"admin"},[n("el-table",{staticStyle:{width:"100%"},attrs:{data:t.adminList}},[n("el-table-column",{attrs:{prop:"id",label:"ID"}}),n("el-table-column",{attrs:{prop:"admin_number",label:"管理员账号"}}),n("el-table-column",{attrs:{prop:"admin_pwd",label:"管理员密码"}}),n("el-table-column",{attrs:{prop:"admin_job",label:"管理员工作"}})],1)],1)},i=[],o={data:function(){return{adminList:[]}},created:function(){this.showadminList()},methods:{showadminList:function(){var t=this;this.$axios.get("/BooksMS/api/owAdmin").then((function(a){var n=a.data;console.log(n),t.adminList=n})).catch((function(t){console.log(t)}))}}},l=o,s=(n("9939"),n("2877")),c=Object(s["a"])(l,e,i,!1,null,"3acb1511",null);a["default"]=c.exports},e857:function(t,a,n){}}]);
//# sourceMappingURL=chunk-6983628d.1126e674.js.map