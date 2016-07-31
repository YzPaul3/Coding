(function replaceBlank(){
    var str = 'We are happy';
    var res = str.replace(/ /g, '%20');
    console.log(res);
}());