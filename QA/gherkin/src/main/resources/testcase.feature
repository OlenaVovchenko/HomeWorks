Feature: Our page
Scenario: Checking tab About on the mane page

Given open tab About from the website:https://ivannetreba.github.io/furniture-store/about.html // Pre-condition

When open website:https://ivannetreba.github.io/furniture-store/about.html // Steps
And click button About
And make sure that page About opens
And click button History
And click button Vision
And click button Goals
Then the website is opened // Expected result
And the button is clickable
And the button Page is opened
And make sure that picture on the left side is not moving
And make sure that description is at the bottom of the page
And make sure that picture on the left side is not moving
And make sure that description is at the bottom of the page
And make sure that picture on the left side is not moving
And make sure that description is at the bottom of the page