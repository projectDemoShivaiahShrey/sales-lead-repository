import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-more',
  templateUrl: './view-more.component.html',
  styleUrls: ['./view-more.component.scss']
})
export class ViewMoreComponent {
    constructor(private route : ActivatedRoute) {}
    ngOnInit() {
      console.log(this.route.snapshot.paramMap.get('clientID'));
    }
}
