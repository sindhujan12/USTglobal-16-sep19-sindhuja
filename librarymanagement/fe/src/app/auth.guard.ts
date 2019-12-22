import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
    providedIn: 'root'
})
export class AuthGuard implements CanActivate {
    constructor() { }

    canActivate(route: ActivatedRouteSnapshot): boolean {
        const expectedRole = route.data.roles;
        const student = JSON.parse(localStorage.getItem('student'));
        for (let i in expectedRole) {
            if (student && (expectedRole[i] === 'student' || expectedRole[i] === 'admin' || expectedRole[i] === 'librarian')) {
                return true;
            } else {
                return false;
            }
        }
    }
}