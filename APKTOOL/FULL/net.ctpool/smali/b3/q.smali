.class public final synthetic Lb3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/b$a;


# instance fields
.field public final synthetic a:Lb3/r;

.field public final synthetic b:LU2/p;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lb3/r;LU2/p;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/q;->a:Lb3/r;

    iput-object p2, p0, Lb3/q;->b:LU2/p;

    iput-wide p3, p0, Lb3/q;->c:J

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lb3/q;->a:Lb3/r;

    iget-object v1, p0, Lb3/q;->b:LU2/p;

    iget-wide v2, p0, Lb3/q;->c:J

    invoke-static {v0, v1, v2, v3}, Lb3/r;->g(Lb3/r;LU2/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
