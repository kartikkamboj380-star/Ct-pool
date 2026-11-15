.class public final LA0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA0/g$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/fragment/app/w;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/RNAppleAuthentication/a;

.field private final d:Lv5/l;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/w;Ljava/lang/String;Lcom/RNAppleAuthentication/a;LA0/d;)V
    .locals 1

    .line 1
    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentTag"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, LA0/e;->a(LA0/d;)Lv5/l;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, LA0/g;-><init>(Landroidx/fragment/app/w;Ljava/lang/String;Lcom/RNAppleAuthentication/a;Lv5/l;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/w;Ljava/lang/String;Lcom/RNAppleAuthentication/a;Lv5/l;)V
    .locals 1

    .line 2
    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentTag"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/g;->a:Landroidx/fragment/app/w;

    iput-object p2, p0, LA0/g;->b:Ljava/lang/String;

    iput-object p3, p0, LA0/g;->c:Lcom/RNAppleAuthentication/a;

    iput-object p4, p0, LA0/g;->d:Lv5/l;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/w;->k0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    instance-of p2, p1, LB0/c;

    if-eqz p2, :cond_0

    check-cast p1, LB0/c;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1, p4}, LB0/c;->v(Lv5/l;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    sget-object v0, LB0/c;->o:LB0/c$a;

    .line 2
    .line 3
    sget-object v1, LA0/g$a;->CREATOR:LA0/g$a$a;

    .line 4
    .line 5
    iget-object v2, p0, LA0/g;->c:Lcom/RNAppleAuthentication/a;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, LA0/g$a$a;->a(Lcom/RNAppleAuthentication/a;)LA0/g$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, LB0/c$a;->a(LA0/g$a;)LB0/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, LA0/g;->d:Lv5/l;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LB0/c;->v(Lv5/l;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LA0/g;->a:Landroidx/fragment/app/w;

    .line 21
    .line 22
    iget-object v2, p0, LA0/g;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/e;->show(Landroidx/fragment/app/w;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
