//设备状态运维JS
var dataCount = 0;
function freshTimeData() {
var kwin =new Ext.Window({
var setKKValue=function(data){
	Ext.getCmp('mywin').hide();
var cancelKK=function(data){
//查询表单
	initComponent : function() {
					xtype : 'compositefield',
					items : [{
						xtype : 'button',
						flex : 31,
						id : "searchBut",
						text : '&nbsp;&nbsp;&nbsp;查询&nbsp;&nbsp;&nbsp;',
						handler : this.historyQueryMethod
					}, {
						flex : 31,
						xtype : 'button',
						id : "resetBut",
						text : '&nbsp;&nbsp;&nbsp;重置&nbsp;&nbsp;&nbsp;',
						handler : this.resetMethod
					}]
				},{
					items : [{
						xtype : 'hidden',
						id : 'kkbhs',
						name : 'kkbhs'
					}]
				}]
			} ]
		Jinpeng.deviceOperation.NorthFormPanel.superclass.initComponent.apply(this);
	},
		if (form.getForm().isValid()) {
			var grid = Ext.getCmp('operationGridPanel');
			grid.store.baseParams = {};// 重置
			dataCount = 20 //一次性加载页面数据量
			//将参数传入后台
				"mounts" : mounts,
				"flag" : "query"
			};
			grid.store.baseParams = baseparams;
			/*刷新选中*/
			this.publish("clearGridSelections",[]);
	},
	resetMethod : function() {
		Ext.getCmp('deviceQueryForm').getForm().reset();
		document.getElementById("ifrm").conten
	}

//所需数据
var operationQueryStore = new Ext.data.JsonStore({
	url : rootpath + "/car/query/realTimeQuery.mvc",
	root : 'result',
	idProperty : 'id',
	totalProperty : 'totalCount',
	autoLoad : false,
	remoteSort : true,
	fields : [ {
			name : 'xxbh'
		},{
			name : 'hphm'
		}, {
			name : 'hpys2'
		}, {
			name : 'hpysmc'
		}, {
			name : 'hpzlmc'
		}, {
			name : 'clsd'
		}, {
			name : 'kkmc'
		}, {
			name : 'dwmc'
		}, {
			name : 'jgsj'
		},
	      {name : 'kkbh'},
	      {name : 'sbbh'},
	      {name : 'sbmc'},
	      {name : 'fxbh'},
	      {name : 'fxmc'},
	      {name : 'cdbh'},
	      {name : 'cwhphm'},
	      {name : 'cwhpys'},
	      {name : 'hpyz'},
	      {name : 'clsd'},
	      {name : 'clxs'},
	      {name : 'cscd'},
	      {name : 'xszt'},
	      {name : 'wfzt'},
	      {name : 'clpp'},
	      {name : 'clwx'},
	      {name : 'csys'},
	      {name : 'cllx'},
	      {name : 'hpzl'},
	      {name : 'tx1'},
	      {name : 'txsl'},
});
//中心右区域数据
Jinpeng.deviceOperation.gridCenterDataPanel = Ext.extend(Ext.grid.GridPanel,{
	id : 'operationGridPanel',
	border : false,
	frame : true,
	pageSize : Jinpeng.PageSize,
	initComponent : function() {
		Ext.apply(this,{
			store : operationQueryStore,
			cm : new Ext.grid.ColumnModel({
				defaults : {
					sortable : false,
				},
				columns : [
						new Ext.ux.grid.PagingRowNumberer({width : 40}),
						{
							header : '卡口名称',
							dataIndex : 'kkmc',
							width : 250,
							renderer: function(value,cellmeta,record,rowIndex,columnIndex,store){ 
							    var now = new Date().getTime();
							    var space = 1800000;//半个小时
							    if(now - record.data.jgsj > space){
							    	return '<font ext:qtip="'+value+'" style="color:red;">'+value+'</font>';
							    }else{
							    	return '<font ext:qtip="'+value+'" style="color:green;">'+value+'</font>';
							    }
							}
						},{
							header : '车牌号码',
							dataIndex : 'hphm',
							renderer: function(value,cellmeta,record,rowIndex,columnIndex,store){ 
							    var now = new Date().getTime();
							    var space = 1800000;//半个小时
							header : '经过时间',
							width : 180,
							dataIndex : 'jgsj',
							renderer: function(value,cellmeta,record,rowIndex,columnIndex,store){ 
							    var now = new Date().getTime();
							    var space = 1800000;//半个小时
							    if(now - record.data.jgsj > space){
							    	return '<font style="color:red;">'+Ext.util.Format.date(new Date(Number(value)), 'Y-m-d H:i:s')+'</font>';
							    }else{
							    	return '<font style="color:green;">'+Ext.util.Format.date(new Date(Number(value)), 'Y-m-d H:i:s')+'</font>';
							    }
							}
						} ]
			}),
				/*双击查看*/
				rowdblclick : function(grid, rowIndex, e ) {
					var data = grid.store.getAt(rowIndex);
					var win = new Jinpeng.deviceOperation.DeviceStatusDetailWindow();
					win.recode = data;
					//将ID设置到弹出框win的属性中，用于win完成渲染后加载数据。
					win.loadId = data.get("xxbh");
					win.tx1 = data.get("tx1");
					win.show();
				}
			}
		});
		Jinpeng.deviceOperation.gridCenterDataPanel.superclass.initComponent.apply(this);
	}
	width : 940,
	height : 550,
	closeAction : "close",
	title : '详细信息',
	border : false,
	clickFlag : false,
	loadId : '',
	recode : null,
	initComponent : function() {
		Jinpeng.deviceOperation.DeviceStatusDetailWindow.superclass.afterRender.call(this);
	/**
	 * 根据ID，detailRegStore加载该条记录的信息。
	 * @param xxbh 信息编号
	 */
	loadRecordById : function(data,carnum) {
	/**
	 * 从grid的store获取详细信息id方法
	 * @author jzxie
	 * @param id
	 * @param upOrDowm
	 *            true&false
	 */
	getDetailRecordId : function(id, upOrDown) {
		var nextId = null;
		//拿该数据在当前store中的id数组所在的序号
		var k = 0;
		var rownum=0;
		if(id!=null){
			if(id.indexOf('|')>0 && id.indexOf('|')!= 0){
				//获取当前行数的Id
				this.loadId = id.substring((id.indexOf('|')+1));
				//获取行数(测试的时候用)
				//rownum = parseInt(id.substring(0,(id.indexOf('|'))));
			}
			for ( var i = 0; i < operationQueryStore.getCount(); i++) {
				if (this.loadId == operationQueryStore.getAt(i).get('xxbh')) {
					k = i;
					break;
				}
		    }
		}
		if (upOrDown == false && k > 0) {
			//测试用的
			//nextId = (rownum-k)+'|'+operationQueryStore.getAt(k-1).get('xxbh');
			//信息编号唯一的情况下使用
			nextId = (k-1)+'|'+operationQueryStore.getAt(k-1).get('xxbh');
		}
		if (upOrDown == true
				&& k < operationQueryStore.getCount() - 1) {			
			//nextId = (k+rownum+1)+'|'+operationQueryStore.getAt(k+1).get('xxbh');
			nextId = (k+1)+'|'+operationQueryStore.getAt(k+1).get('xxbh');	
		}
		if(nextId) {
			this.loadId = nextId;
		}
		return nextId;
	},
	/**
	 * 同步"上一条","下一条"按钮状态.
	 */
	synchronUpOrDown : function(id) {
		var count = operationQueryStore.getCount();
		var index = 0;
		for ( var i = 0; i < count; i++) {
			if (id == operationQueryStore.getAt(i).get('xxbh')) {
				index = i;
				break;
			}
		}
		//更改状态
		if (count == 1) {
			Ext.getCmp('nextButton').disable();
			Ext.getCmp('prevButton').disable();
		} else if(index == 0) {
			Ext.getCmp('prevButton').disable();
			if(count == 2) {
				Ext.getCmp('nextButton').enable();
			}
		} else if (index == (count-1)) {
			Ext.getCmp('nextButton').disable();
			if(count == 2) {
				Ext.getCmp('prevButton').enable();
			}
		} else {
			Ext.getCmp('prevButton').enable();
			Ext.getCmp('nextButton').enable();
		}
	}
});