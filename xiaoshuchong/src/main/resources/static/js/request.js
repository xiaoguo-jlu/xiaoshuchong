function getParams(){
    let url = window.location.href;
    let paramString = url.split("?")[1]
    let pairs = ""
    let params = {};
    for(pairs of paramString.split("&")){
        var key = pairs.split("=")[0];
        var value = pairs.split("=")[1];
        params[key] = value;
    }
    return params;
}