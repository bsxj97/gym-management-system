
var projectName = '健身房管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '健身项目',
	url: './pages/jianshenxiangmu/list.html'
}, 
{
	name: '教练信息',
	url: './pages/jiaolianxinxi/list.html'
}, 

{
	name: '健身资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot6hv37/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"教练","menuJump":"列表","tableName":"jiaolian"}],"menu":"教练管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除","查看评论"],"menu":"健身项目","menuJump":"列表","tableName":"jianshenxiangmu"}],"menu":"健身项目管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"项目分类","menuJump":"列表","tableName":"xiangmufenlei"}],"menu":"项目分类管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除","查看评论"],"menu":"教练信息","menuJump":"列表","tableName":"jiaolianxinxi"}],"menu":"教练信息管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","删除"],"menu":"教练预约","menuJump":"列表","tableName":"jiaolianyuyue"}],"menu":"教练预约管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"健身资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"健身项目列表","menuJump":"列表","tableName":"jianshenxiangmu"}],"menu":"健身项目模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","预约"],"menu":"教练信息列表","menuJump":"列表","tableName":"jiaolianxinxi"}],"menu":"教练信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"教练预约","menuJump":"列表","tableName":"jiaolianyuyue"}],"menu":"教练预约管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"健身项目列表","menuJump":"列表","tableName":"jianshenxiangmu"}],"menu":"健身项目模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","预约"],"menu":"教练信息列表","menuJump":"列表","tableName":"jiaolianxinxi"}],"menu":"教练信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除","查看评论"],"menu":"教练信息","menuJump":"列表","tableName":"jiaolianxinxi"}],"menu":"教练信息管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","删除","审核"],"menu":"教练预约","menuJump":"列表","tableName":"jiaolianyuyue"}],"menu":"教练预约管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"健身项目列表","menuJump":"列表","tableName":"jianshenxiangmu"}],"menu":"健身项目模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","预约"],"menu":"教练信息列表","menuJump":"列表","tableName":"jiaolianxinxi"}],"menu":"教练信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教练","tableName":"jiaolian"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
