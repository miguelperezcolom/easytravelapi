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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.EasyTravelApi) {
      root.EasyTravelApi = {};
    }
    root.EasyTravelApi.UpdateOperation = factory(root.EasyTravelApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The UpdateOperation model module.
   * @module model/UpdateOperation
   * @version 0.1.9
   */

  /**
   * Constructs a new <code>UpdateOperation</code>.
   * Describes an update operation, like modifying allotment, prices or stop sales
   * @alias module:model/UpdateOperation
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>UpdateOperation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UpdateOperation} obj Optional instance to populate.
   * @return {module:model/UpdateOperation} The populated <code>UpdateOperation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('hotelId')) {
        obj['hotelId'] = ApiClient.convertToType(data['hotelId'], 'String');
      }
      if (data.hasOwnProperty('roomId')) {
        obj['roomId'] = ApiClient.convertToType(data['roomId'], 'String');
      }
      if (data.hasOwnProperty('action')) {
        obj['action'] = ApiClient.convertToType(data['action'], 'String');
      }
      if (data.hasOwnProperty('startDate')) {
        obj['startDate'] = ApiClient.convertToType(data['startDate'], 'Number');
      }
      if (data.hasOwnProperty('endDate')) {
        obj['endDate'] = ApiClient.convertToType(data['endDate'], 'Number');
      }
      if (data.hasOwnProperty('newValue')) {
        obj['newValue'] = ApiClient.convertToType(data['newValue'], 'String');
      }
    }
    return obj;
  }

  /**
   * Hotel id you got when you called the getgrantedhotels method
   * @member {String} hotelId
   */
  exports.prototype['hotelId'] = undefined;
  /**
   * Room id you got when you called the getgrantedhotels method
   * @member {String} roomId
   */
  exports.prototype['roomId'] = undefined;
  /**
   * Action you want to perform. E.g. STOPSALES, OPENSALES, SETPRICE, SETALLOTMENT, ...
   * @member {String} action
   */
  exports.prototype['action'] = undefined;
  /**
   * Locale date this data starts appliance. In format YYYMMDD
   * @member {Number} startDate
   */
  exports.prototype['startDate'] = undefined;
  /**
   * Locale date this data ends appliance. In format YYYMMDD
   * @member {Number} endDate
   */
  exports.prototype['endDate'] = undefined;
  /**
   * New value to be set
   * @member {String} newValue
   */
  exports.prototype['newValue'] = undefined;



  return exports;
}));

