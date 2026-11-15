.class public final synthetic Lb3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/b$a;


# instance fields
.field public final synthetic a:Lb3/r;

.field public final synthetic b:LU2/p;


# direct methods
.method public synthetic constructor <init>(Lb3/r;LU2/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/k;->a:Lb3/r;

    iput-object p2, p0, Lb3/k;->b:LU2/p;

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb3/k;->a:Lb3/r;

    iget-object v1, p0, Lb3/k;->b:LU2/p;

    invoke-static {v0, v1}, Lb3/r;->d(Lb3/r;LU2/p;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
