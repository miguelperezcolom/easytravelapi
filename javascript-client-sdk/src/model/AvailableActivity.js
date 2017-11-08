/**
 * EasyTravelApi
 * API for travel agents
 *
 * OpenAPI spec version: 0.1.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/HolderForAnActivityDate'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./HolderForAnActivityDate'));
  } else {
    // Browser globals (root is window)
    if (!root.EasyTravelApi) {
      root.EasyTravelApi = {};
    }
    root.EasyTravelApi.AvailableActivity = factory(root.EasyTravelApi.ApiClient, root.EasyTravelApi.HolderForAnActivityDate);
  }
}(this, function(ApiClient, HolderForAnActivityDate) {
  'use strict';




  /**
   * The AvailableActivity model module.
   * @module model/AvailableActivity
   * @version 0.1.9
   */

  /**
   * Constructs a new <code>AvailableActivity</code>.
   * An available activity
   * @alias module:model/AvailableActivity
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>AvailableActivity</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AvailableActivity} obj Optional instance to populate.
   * @return {module:model/AvailableActivity} The populated <code>AvailableActivity</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('activityId')) {
        obj['activityId'] = ApiClient.convertToType(data['activityId'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('image')) {
        obj['image'] = ApiClient.convertToType(data['image'], 'String');
      }
      if (data.hasOwnProperty('availableDates')) {
        obj['availableDates'] = ApiClient.convertToType(data['availableDates'], [HolderForAnActivityDate]);
      }
    }
    return obj;
  }

  /**
   * This activity ID
   * @member {String} activityId
   */
  exports.prototype['activityId'] = undefined;
  /**
   * The name of this activity. Usually multi-language
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * The description of this activity. Usually multi-language
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * The main image for this activity
   * @member {String} image
   */
  exports.prototype['image'] = undefined;
  /**
   * List of available dates (and hours) for this activity. Here you will find prices
   * @member {Array.<module:model/HolderForAnActivityDate>} availableDates
   */
  exports.prototype['availableDates'] = undefined;



  return exports;
}));

