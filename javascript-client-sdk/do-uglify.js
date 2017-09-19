var uglify = require('uglify');
var package = require('./package.json');
var uglifyConfig = package.uglifyConfig;
// Call the UglifyJS Javascript API, passing config from uglifyConfig