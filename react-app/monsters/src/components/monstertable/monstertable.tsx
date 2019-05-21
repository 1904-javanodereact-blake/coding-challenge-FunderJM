import React from 'react';
import { Monsters } from "../../models/monsters";


interface IMonsterTable{
    monsters: Monsters;
}

export class MonsterTableComponent extends React.PureComponent<IMonsterTable> {
    render(){
        const Monsters = this.props.monsters;
        return(
            <div className = "monster table">
                
            </div>
        )
    }
}