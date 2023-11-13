#include<GL/glut.h>

void init(void)
{
	glEnable(GL_BLEND);
	glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
	glClearColor(1.0, 1.0, 1.0, 0.0);
}

void display(void)
{
	glClear(GL_COLOR_BUFFER_BIT);
	glBegin(GL_TRIANGLES);
	glColor4f(1.0, 0.0, 0.0, 0.75);
	glVertex3f(0, -0.5, 0.0);
	glVertex3f(0.5, -0.5, 0.0);
	glVertex3f(0, 1, 0.0);
	glEnd();

	glBegin(GL_POLYGON);
	glColor4f(0.0, 0.0, 1.0, 0.75);
	glVertex3f(-0.6, -0.6, 0);
	glVertex3f(0.6, -0.6, 0);	
	glVertex3f(0.6, 0.6, 0);
	glVertex3f(-0.6, 0.6, 0);
	glEnd();
	glFlush();
}

int main(int argc, char** argv)
{
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowSize(600, 400);
	glutInitWindowPosition(200, 100);
	glutCreateWindow("Muhammad Saifullah Sani - 1908107010062");
	init();
	glutDisplayFunc(display);
	glutMainLoop();

	return 0;
}