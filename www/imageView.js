/*global cordova*/
var argscheck = require('cordova/argscheck'),
    exec = require('cordova/exec'),
    utils = require('cordova/utils')

module.exports = {


    openImage: function (success, failure, url) {
        //alert("hmm");
        cordova.exec(success, failure, "openImage", "openImage", [url]);
    }


};
