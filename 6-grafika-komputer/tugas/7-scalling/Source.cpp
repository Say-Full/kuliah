#include <windows.h>
#include <GL/glut.h>

void initGL() {
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}

void display() {
	glClear(GL_COLOR_BUFFER_BIT);
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();

	glBegin(GL_TRIANGLES);
		glColor3f(0.0f, 0.0f, 1.0f);
		glVertex2f(-0.7f, 0.9f);
		glVertex2f(-0.9f, 0.5f);
		glVertex2f(-0.5f, 0.5f);
	glEnd();

	glBegin(GL_QUADS);
		glColor3f(1.0f, 0.0f, 0.0f);
		glVertex2f(-0.3f, 0.0f);
		glVertex2f(0.0f, 0.0f);
		glVertex2f(0.0f, 0.3f);
		glVertex2f(-0.3f, 0.3f);
	glEnd();

	glBegin(GL_POLYGON);
		glColor3f(1.0f, 1.0f, 0.0f);
		glVertex2f(0.4f, -0.9f);
		glVertex2f(0.7f, -0.9f);
		glVertex2f(0.9f, -0.6f);
		glVertex2f(0.7f, -0.3f);
		glVertex2f(0.4f, -0.3f);
		glVertex2f(0.2f, -0.6f);
	glEnd();

	glFlush();
}

void Draw_scalling() {
	glPushMatrix();

	glScalef(0.3, 0.3, 0.0);
	glBegin(GL_TRIANGLES);
		glColor3f(0.0f, 0.0f, 1.0f);
		glVertex2f(-0.7f, 0.9f);
		glVertex2f(-0.9f, 0.5f);
		glVertex2f(-0.5f, 0.5f);
	glEnd();

	glScalef(1.5, 1.5, 0.0);
	glBegin(GL_QUADS);
		glColor3f(1.0f, 0.0f, 0.0f);
		glVertex2f(-0.3f, 0.0f);
		glVertex2f(0.0f, 0.0f);
		glVertex2f(0.0f, 0.3f);
		glVertex2f(-0.3f, 0.3f);
	glEnd();

	glScalef(0.3, 0.3, 0.0);
	glBegin(GL_POLYGON);
		glColor3f(1.0f, 1.0f, 0.0f);
		glVertex2f(0.4f, -0.9f);
		glVertex2f(0.7f, -0.9f);
		glVertex2f(0.9f, -0.6f);
		glVertex2f(0.7f, -0.3f);
		glVertex2f(0.4f, -0.3f);
		glVertex2f(0.2f, -0.6f);
	glEnd();

	glPopMatrix();
	glFlush();
}

void handleKeypress(unsigned char key, int x, int y) {
	switch (key) {
	case 'y':
	case 'Y':
		glClear(GL_COLOR_BUFFER_BIT);
		Draw_scalling();
		break;
	default:
		exit(0);
	}
}

int main(int argc, char** argv) {
	glutInit(&argc, argv);
	glutInitWindowSize(640, 480);
	glutInitWindowPosition(50, 50);
	glutCreateWindow("Muhammad Saifullah Sani - 1908107010062 - A");
	display();
	glutKeyboardFunc(handleKeypress);
	initGL();
	glutMainLoop();
	return 0;
}