#include "GL/freeglut.h"
#include "GL/gl.h"
#include <GL/glut.h>

void initGL() {
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}

void display() {
	glClear(GL_COLOR_BUFFER_BIT);

	glBegin(GL_POINTS);
	
		glVertex2f(0.5f, 0.5f);
		glVertex2f(0.5f, -0.5f);
		glVertex2f(-0.5f, 0.5f);
		glVertex2f(-0.5f, -0.5f);
	

	/*
		glVertex2f(0.7f, 0.9f);
		glVertex2f(0.25f, -0.3f);
		glVertex2f(-0.22f, 0.27f);
		glVertex2f(-0.79f, -0.97f);
	*/

	/*
		glVertex2f(0.01f, 0.f);
		glVertex2f(0.02f, 0.f);
		glVertex2f(0.03f, 0.f);
		glVertex2f(0.04f, 0.f);
		glVertex2f(0.05f, 0.f);
		glVertex2f(0.06f, 0.f);
		glVertex2f(0.07f, 0.f);
		glVertex2f(0.08f, 0.f);
		glVertex2f(0.09f, 0.f);
		glVertex2f(0.1f, 0.f);
		glVertex2f(0.11f, 0.f);
		glVertex2f(0.12f, 0.f);
		glVertex2f(0.13f, 0.f);
		glVertex2f(0.14f, 0.f);
		glVertex2f(0.15f, 0.f);
		glVertex2f(0.16f, 0.f);
		glVertex2f(0.17f, 0.f);
		glVertex2f(0.18f, 0.f);
		glVertex2f(0.19f, 0.f);
		glVertex2f(0.2f, 0.f);
	*/

	/*
		glVertex2f(0.f, 0.01f);
		glVertex2f(0.f, 0.02f);
		glVertex2f(0.f, 0.03f);
		glVertex2f(0.f, 0.04f);
		glVertex2f(0.f, 0.05f);
		glVertex2f(0.f, 0.06f);
		glVertex2f(0.f, 0.07f);
		glVertex2f(0.f, 0.08f);
		glVertex2f(0.f, 0.09f);
		glVertex2f(0.f, 0.1f);
		glVertex2f(0.f, 0.11f);
		glVertex2f(0.f, 0.12f);
		glVertex2f(0.f, 0.13f);
		glVertex2f(0.f, 0.14f);
		glVertex2f(0.f, 0.15f);
		glVertex2f(0.f, 0.16f);
		glVertex2f(0.f, 0.17f);
		glVertex2f(0.f, 0.18f);
		glVertex2f(0.f, 0.19f);
		glVertex2f(0.f, 0.2f);
	*/


	glEnd();

	glFlush();
}

int main(int argc, char** argv) {
	glutInit(&argc, argv);
	glutCreateWindow("Coordinates - Dalila");
	glutInitWindowSize(320, 320);
	glutInitWindowPosition(50, 50);
	glutDisplayFunc(display);
	initGL();
	glutMainLoop();

	return 0;
}