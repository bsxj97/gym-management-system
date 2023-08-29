const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot6hv37/",
            name: "springboot6hv37",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot6hv37/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "健身房管理系统"
        } 
    }
}
export default base
