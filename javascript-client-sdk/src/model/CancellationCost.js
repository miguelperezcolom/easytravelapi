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
    define(['ApiClient', 'model/Amount'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Amount'));
  } else {
    // Browser globals (root is window)
    if (!root.EasyTravelApi) {
      root.EasyTravelApi = {};
    }
    root.EasyTravelApi.CancellationCost = factory(root.EasyTravelApi.ApiClient, root.EasyTravelApi.Amount);
  }
}(this, function(ApiClient, Amount) {
  'use strict';




  /**
   * The CancellationCost model module.
   * @module model/CancellationCost
   * @version 0.1.9
   */

  /**
   * Constructs a new <code>CancellationCost</code>.
   * @alias module:model/CancellationCost
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>CancellationCost</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CancellationCost} obj Optional instance to populate.
   * @return {module:model/CancellationCost} The populated <code>CancellationCost</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('retail')) {
        obj['retail'] = Amount.constructFromObject(data['retail']);
      }
      if (data.hasOwnProperty('commission')) {
        obj['commission'] = Amount.constructFromObject(data['commission']);
      }
      if (data.hasOwnProperty('net')) {
        obj['net'] = Amount.constructFromObject(data['net']);
      }
      if (data.hasOwnProperty('gmttime')) {
        obj['gmttime'] = ApiClient.convertToType(data['gmttime'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:model/Amount} retail
   */
  exports.prototype['retail'] = undefined;
  /**
   * @member {module:model/Amount} commission
   */
  exports.prototype['commission'] = undefined;
  /**
   * @member {module:model/Amount} net
   */
  exports.prototype['net'] = undefined;
  /**
   * @member {String} gmttime
   */
  exports.prototype['gmttime'] = undefined;



  return exports;
}));

