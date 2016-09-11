    $(function () {
      $("input[type='checkbox']").checkboxradio("refresh");
    })

    /* When AngularJS updates a $scope property, the corresponding elements
     * are not immediately updated. A timeout is required to give the
     * elements the chance to refresh. Then jQueryMobile can refresh its
     * decorative interface.
     */
    function refreshChangedItems() {
      window.setTimeout(function () {
         $("input[type='checkbox']").checkboxradio("refresh");
      }, 1)
    }
    function enhanceChangedItems(id) {
      window.setTimeout(function () {
         $("#" + id).parent().enhanceWithin();
      }, 1)
    }	