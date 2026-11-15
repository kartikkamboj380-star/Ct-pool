.class Landroidx/loader/app/b$c;
.super Landroidx/lifecycle/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/loader/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final f:Landroidx/lifecycle/F$b;


# instance fields
.field private d:Ln/h;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/loader/app/b$c$a;

    invoke-direct {v0}, Landroidx/loader/app/b$c$a;-><init>()V

    sput-object v0, Landroidx/loader/app/b$c;->f:Landroidx/lifecycle/F$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/E;-><init>()V

    new-instance v0, Ln/h;

    invoke-direct {v0}, Ln/h;-><init>()V

    iput-object v0, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/loader/app/b$c;->e:Z

    return-void
.end method

.method static h(Landroidx/lifecycle/H;)Landroidx/loader/app/b$c;
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/F;

    sget-object v1, Landroidx/loader/app/b$c;->f:Landroidx/lifecycle/F$b;

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/F;-><init>(Landroidx/lifecycle/H;Landroidx/lifecycle/F$b;)V

    const-class p0, Landroidx/loader/app/b$c;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/F;->a(Ljava/lang/Class;)Landroidx/lifecycle/E;

    move-result-object p0

    check-cast p0, Landroidx/loader/app/b$c;

    return-object p0
.end method


# virtual methods
.method protected d()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/E;->d()V

    iget-object v0, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v0}, Ln/h;->m()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v2, v1}, Ln/h;->p(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/loader/app/b$a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroidx/loader/app/b$a;->o(Z)LQ/c;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v0}, Ln/h;->b()V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v0}, Ln/h;->m()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loaders:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v2}, Ln/h;->m()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v2, v1}, Ln/h;->p(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/loader/app/b$a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v3, v1}, Ln/h;->k(I)I

    move-result v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/loader/app/b$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0, p2, p3, p4}, Landroidx/loader/app/b$a;->p(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/loader/app/b$c;->e:Z

    return-void
.end method

.method i(I)Landroidx/loader/app/b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v0, p1}, Ln/h;->g(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/loader/app/b$a;

    return-object p1
.end method

.method j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/loader/app/b$c;->e:Z

    return v0
.end method

.method k()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v0}, Ln/h;->m()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v2, v1}, Ln/h;->p(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/loader/app/b$a;

    invoke-virtual {v2}, Landroidx/loader/app/b$a;->r()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method l(ILandroidx/loader/app/b$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/loader/app/b$c;->d:Ln/h;

    invoke-virtual {v0, p1, p2}, Ln/h;->l(ILjava/lang/Object;)V

    return-void
.end method

.method m()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/loader/app/b$c;->e:Z

    return-void
.end method
