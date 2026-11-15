.class public final LT5/E$a$a;
.super LT5/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT5/E$a;->b(Li6/h;LT5/x;J)LT5/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic n:Li6/h;

.field final synthetic o:LT5/x;

.field final synthetic p:J


# direct methods
.method constructor <init>(Li6/h;LT5/x;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LT5/E$a$a;->n:Li6/h;

    .line 2
    .line 3
    iput-object p2, p0, LT5/E$a$a;->o:LT5/x;

    .line 4
    .line 5
    iput-wide p3, p0, LT5/E$a$a;->p:J

    .line 6
    .line 7
    invoke-direct {p0}, LT5/E;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, LT5/E$a$a;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public f()LT5/x;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/E$a$a;->o:LT5/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Li6/h;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/E$a$a;->n:Li6/h;

    .line 2
    .line 3
    return-object v0
.end method
