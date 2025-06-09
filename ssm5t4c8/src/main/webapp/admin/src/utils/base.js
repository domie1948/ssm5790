const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm5t4c8/",
            name: "ssm5t4c8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm5t4c8/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网络作业提交与批改系统"
        } 
    }
}
export default base
