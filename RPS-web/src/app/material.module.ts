import { NgModule } from '@angular/core';
// Import as needed
import {
    // MatAutocompleteModule,
    // MatBadgeModule,
    // MatBottomSheetModule,
    MatButtonModule,
    // MatButtonToggleModule,
    // MatCardModule,
    MatCheckboxModule,
    // MatChipsModule,
    // MatDatepickerModule,
    // MatDialogModule,
    // MatDividerModule,
    // MatExpansionModule,
    // MatGridListModule,
    MatIconModule,
    MatFormFieldModule, 
    // MatInputModule,
    // MatListModule,
    // MatMenuModule,
    // MatNativeDateModule,
    // MatPaginatorModule,
    // MatProgressBarModule,
    // MatProgressSpinnerModule,
    // MatRadioModule,
    // MatRippleModule,
    MatSelectModule,
    MatSidenavModule,
    MatSliderModule,
    MatSlideToggleModule,
    // MatSnackBarModule,
    // MatSortModule,
    // MatStepperModule,
    // MatTableModule,
    // MatTabsModule,
    // MatToolbarModule,
    // MatTooltipModule,
    // MatTreeModule,
  } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  imports: [MatButtonModule, MatCheckboxModule, MatSidenavModule,
            MatIconModule, MatSlideToggleModule, MatSliderModule,
            BrowserAnimationsModule, MatFormFieldModule, MatSelectModule],
  exports: [MatButtonModule, MatCheckboxModule, MatSidenavModule,
            MatIconModule, MatSlideToggleModule, MatSliderModule,
            BrowserAnimationsModule, MatFormFieldModule, MatSelectModule],
})
export class MaterialModule { }
