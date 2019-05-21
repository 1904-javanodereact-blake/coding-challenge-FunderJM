
export class Monsters {
    monsterId: number;
    monster: String;
    isGoodOrBad: boolean;


    constructor(monsterId = 0, monster = '', isGoodOrBad = true){
        this.monsterId = monsterId;
        this.monster = monster;
        this.isGoodOrBad = isGoodOrBad;
    }
}