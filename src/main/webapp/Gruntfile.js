module.exports = function(grunt) {

  // Project configuration.
  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),
    concat: {
    	  options: {
    	    // 定义一个用于插入合并输出文件之间的字符
    	    separator: ';'
    	  },
    	  dist: {
    	    // 将要被合并的文件
    	    src: ['src/**/*.js'],
    	    // 合并后的JS文件的存放位置
    	    dest: 'dist/<%= pkg.name %>.js'
    	  }
    },
    uglify: {
      options: {
        banner: '/*! <%= pkg.name %> <%= grunt.template.today("yyyy-mm-dd") %> */\n'
      },
      build: {
    	  files:{
			  "build/js/index.min.js":["assets/js/*.js"]
		  }
      }
	},
    jshint: {
      options: {
        //大括号包裹
        curly: true,
        //对于简单类型，使用===和!==，而不是==和!=
        eqeqeq: true,
        //对于首字母大写的函数（声明的类），强制使用new
        newcap: true,
        //禁用arguments.caller和arguments.callee
        noarg: true,
        //对于属性使用aaa.bbb而不是aaa['bbb']
        sub: true,
        //查找所有未定义变量
        //undef: true,
        //查找类似与if(a = 0)这样的代码
        boss: true
      },
      //具体任务配置
      files: {
        src: ['assets/js/*.js']
      }
    },
    less:{
      development:{
        options:{},
        files: {
          "assets/css/parent/index.css": ["assets/less/parent/header.less", "assets/less/parent/index.less"]

        }
      },
      production:{
        options:{
          plugins:[

          ]
        },
        files:{
          "assets/less/parent/index.css": ["assets/less/parent/header.less","assets/less/parent/index.less"]
        }
      }
    },
    cssmin: {    // 任务名称
      combine: {
        files: {
          "assets/css/parent/index.min.css": ["assets/css/parent/index.css"]
        }
      }
    },
    watch:{
      options:{
        livereload:true
      },
      script:{
       files:'assets/**/*.js',
        tasks:['uglify','jshint']
      },
      css:{
        files:"**/*.less",
        tasks:['less']
      },
      mincss:{
        files:'**/*.css',
        tasks:['cssmin']
      }
    }
  });

  // 加载包含 "uglify" 任务的插件。
  grunt.loadNpmTasks('grunt-contrib-uglify');
  grunt.loadNpmTasks('grunt-contrib-jshint');
  // grunt.loadNpmTasks('grunt-contrib-qunit');
  grunt.loadNpmTasks('grunt-contrib-watch');
  //grunt.loadNpmTasks('grunt-contrib-concat');
  grunt.loadNpmTasks('grunt-contrib-less');
  grunt.loadNpmTasks('grunt-contrib-cssmin');

  // 只需在命令行上输入"grunt"，就会执行default task
  grunt.registerTask('default', ['watch']);

};
