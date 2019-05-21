import {BehaviorSubject} from 'rxjs';
import {User} from '../models/user';

const userStream = new BehaviorSubject<User>(undefined);

export const user$ = userStream.asObservable();

export function updateCurrentUser(user: User) {
    userStream.next(user);
}