.class public final synthetic La3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/b$a;


# instance fields
.field public final synthetic a:La3/c;

.field public final synthetic b:LU2/p;

.field public final synthetic c:LU2/i;


# direct methods
.method public synthetic constructor <init>(La3/c;LU2/p;LU2/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/b;->a:La3/c;

    iput-object p2, p0, La3/b;->b:LU2/p;

    iput-object p3, p0, La3/b;->c:LU2/i;

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La3/b;->a:La3/c;

    iget-object v1, p0, La3/b;->b:LU2/p;

    iget-object v2, p0, La3/b;->c:LU2/i;

    invoke-static {v0, v1, v2}, La3/c;->b(La3/c;LU2/p;LU2/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
