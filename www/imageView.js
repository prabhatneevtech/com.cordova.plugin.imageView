/*global cordova*/
var argscheck = require('cordova/argscheck'),
    exec = require('cordova/exec'),
    utils = require('cordova/utils')

module.exports = {
    openImage: function (success, failure, url) {
        cordova.exec(success, failure, "ImageViewer", "openImage", [url]);
    }

};