$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'user/find',
        datatype: "json",
        colModel: [
            { label: 'id', name: 'id', index: "id", width: 30, key: true },
            { label: '用户名', name: 'user_name', index: "user_name", width: 50 },

        ],
        viewrecords: true,
        height: 385,
        rowNum: 10,
        rowList : [10,30,50],
        rownumbers: true,
        rownumWidth: 25,
        autowidth:true,
        multiselect: false,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.records",
            page: "page.current",
            total: "page.pages",
            records: "page.total"
        },
        prmNames : {
            page:"page",
            rows:"limit",
            order: "order"
        },
        gridComplete:function(){
            //隐藏grid底部滚动条
            $("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" });
        }
    });
});

var vm = new Vue({
    el:'#jeefastapp',
    data:{
        q:{
            key: null
        },
    },
    methods: {
        query: function () {
            vm.reload();
        },
        reload: function (event) {
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'uname': vm.q.key},
                page:page
            }).trigger("reloadGrid");

        }
    }
});