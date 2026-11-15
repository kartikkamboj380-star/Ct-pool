.class public final Lt4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt4/a$g;,
        Lt4/a$h;,
        Lt4/a$f;,
        Lt4/a$d;,
        Lt4/a$e;,
        Lt4/a$b;,
        Lt4/a$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt4/a;->a:Landroid/os/Bundle;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/a;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-static {v0}, Lu4/g;->f(Landroid/os/Bundle;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
