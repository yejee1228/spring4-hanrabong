var app = (()=>{
		return {
			init : (ctx)=>{
				service.join(ctx);
				service.login(ctx);
				service.go_join(ctx);
			}
		};
})();
var user = (()=>{
	var _empNo, _eName, _job, _mgr, _hireDate, _sal, _comm, _deptNo;
	var setEmpNo = (empNo)=>{this._empNo = empNo;}
	var setEName = (eName)=>{this._eName = eName;}
	var getEmpNo = ()=>{return this._empNo;}
	var getEName = ()=>{return this._eName;}
	return {
		setEmpNo : setEmpNo,
		setEName : setEName,
		getEmpNo : getEmpNo,
		getEName : getEName
	};
})();
var service = (()=>{
		return {
			join :(ctx)=>{
				$('#join_btn').click(()=>{
					if($('#input_empNo').val()===''||
							$('#input_eName').val()===''||
							$('#input_job').val()===''||
							$('#input_mgr').val()===''||
							$('#input_hireDate').val()===''||
							$('#input_sal').val()===''||
							$('#input_comm').val()===''||
							$('#input_deptNo').val()===''){
						alert('필수값이 없습니다.')
					}else{
						alert('가입성공');
						$('#join_form').attr('action',ctx+'/emp.do');
						$('#join_form').attr('method','post');
						$('#join_form').submit();
					}
				});
			},
			login :(ctx)=>{
				$('#login_btn').click(()=>{
					if($('#input_empNo').val()===''||
						$('#input_eName').val()===''||
						$('#input_deptNo').val()===''){
						alert('필수값이 없습니다.')
					}else{
						alert('로그인성공');
						$('#login_form').attr('action',ctx+'/emp.do');
						$('#login_form').attr('method','post');
						$('#login_form').submit();
					}
				});
			},
			go_join : (ctx)=>{
				$('#a_join').click(()=>{
					alert('회원가입 이동!');
					location.assign(ctx +'/facade.do?action=myPage&page=join');
				});
			},
			mypage_back : (ctx)=>{
				$('#mypage_back').click(()=>{
					alert('뒤로이동');
					location.assign(ctx +'/facade.do?action=move&page=login');
				});
			}
			
		};
})();
