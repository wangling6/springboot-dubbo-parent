$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'union/find',
        datatype: "json",
        colModel: [
            { label: 'id', name: 'id', index: "id", width: 30, key: true },
            { label: '联盟名称', name: 'union_name', index: "union_name", width: 50 },
            { label: '英文名', name: 'union_ename', index: "union_ename", width: 50 },
            { label: '组织成员', name: 'group_names', index: "group_names", width: 50 },
            { label: '联盟描述', name: 'union_desc', index: "union_desc", width: 50 },
            { label: '状态', name: 'unionstatus', index: "unionstatus", width: 50 },
            { label: '创建时间', name: 'create_time', index: "create_time", width: 50 }

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
        e:{
            key: null
        }
    },
    methods: {
        query: function () {
            vm.reload();
        },
        reload: function (event) {
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'uname': vm.q.key,'ename': vm.e.key},
                page:page
            }).trigger("reloadGrid");

        }
    }
});