import React, { useContext, useEffect } from 'react'
import { useNavigate } from 'react-router-dom'
import * as auth from '../../../apis/auth'
import * as Swal from '../../../apis/alert'
import { LoginContext } from '../../../contexts/LoginContextProvider'
import UserForm from '../../../components/MyPage/UserForm'


const User = () => {
 // context
 const {isLoading, isLogin, roles, logout, userInfo } = useContext(LoginContext)

 const navigete = useNavigate()

 const updateUser = async (form) => {
   console.log(form);
   let response
   let data
   try {
       response = await auth.update(form)

   } catch (error) {
     console.error(error);
     console.error(`회원정보 수정 중 에러가 발생하였습니다.`)
     return
     
   }
   data = response.data
   const status = response.status
   console.log(`data : ${data}`);
   console.log(`status : ${status}`);

   if(status == 200) {
     console.log(`회원정보 수정 성공`)
     Swal.confirm('회원정보 수정 성공', '로그아웃 후 다시 로그인 해주세요.', 'success' , () => logout(true))
   }
   else{
     console.log(`회원정보 수정 실패`)
     Swal.confirm('회원정보 수정 실패', '회원정보 수정에 실패했습니다.', 'error' )
   }

 }

 const removeUser = async (no) => {
   console.log("이거 왜 안나옴?" + no)

   let response
   let data
   try {
     response = await auth.remove(no)
   } catch (error) {
 console.log(error)
 console.log('회원 탈퇴 처리 중 에러가 발생하였습니다.');
 
 
   }
   data = response.data
   const status = response.status

   if(status == 200){
     Swal.alert("회원탈퇴 성공", "그동안 감사했습니다.🎁", "success", 
       // 로그아웃 처리
       () => { logout(true) } )
   }
   else
   Swal.alert("회원탈퇴 실패", "들어올 땐 마음대로 들어왔지만 나갈 때 그럴 수 없습니다..🎁", "error",
   () => logout(true))

 }

 useEffect(() => {
   if(isLoading) return

   if(!isLogin || !roles.isUser){
     Swal.alert('로그인을 시도해주세요', '로그인 화면으로 이동합니다', 'warning', () => { navigete('/login')})
     return
   }
 }, [isLoading])
 

 return (
   <>
   <div className="container">
       <h1>User</h1>
       <hr />
       <h2>마이페이지</h2>

       <UserForm userInfo={userInfo} updateUser={updateUser} removeUser={removeUser} />
   </div>
</>
 )
}

export default User