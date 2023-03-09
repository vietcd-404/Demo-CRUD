var add = angular.module("myApp",[]);
let url = "http://localhost:9090"
add.controller("myCon", function ($scope,$http) {
    $scope.listUser =[];
    $http.get(url).then(function (r){
        $scope.listUser = r.data;
    })
})