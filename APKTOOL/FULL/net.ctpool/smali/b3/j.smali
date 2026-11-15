.class public final synthetic Lb3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/b$a;


# instance fields
.field public final synthetic a:Lb3/r;

.field public final synthetic b:LU2/p;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lb3/r;LU2/p;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/j;->a:Lb3/r;

    iput-object p2, p0, Lb3/j;->b:LU2/p;

    iput p3, p0, Lb3/j;->c:I

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lb3/j;->a:Lb3/r;

    iget-object v1, p0, Lb3/j;->b:LU2/p;

    iget v2, p0, Lb3/j;->c:I

    invoke-static {v0, v1, v2}, Lb3/r;->f(Lb3/r;LU2/p;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
