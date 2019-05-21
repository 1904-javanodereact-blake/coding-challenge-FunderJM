

export class User {
   user_id: number;
   userName: string;
   userPass: string;
   userRole: string;

   constructor(user_id = 0, userName = '', userPass = '', userRole = ''){
       this.user_id = user_id;
       this.userName = userName;
       this.userPass = userPass;
       this.userRole = userRole;
   }

}