.class public final Lh6/d$h;
.super LX5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh6/d;->x()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lh6/d;

.field final synthetic h:Lh6/h;

.field final synthetic i:Li6/i;

.field final synthetic j:Lw5/v;

.field final synthetic k:Lw5/t;

.field final synthetic l:Lw5/v;

.field final synthetic m:Lw5/v;

.field final synthetic n:Lw5/v;

.field final synthetic o:Lw5/v;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLh6/d;Lh6/h;Li6/i;Lw5/v;Lw5/t;Lw5/v;Lw5/v;Lw5/v;Lw5/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh6/d$h;->e:Ljava/lang/String;

    iput-boolean p2, p0, Lh6/d$h;->f:Z

    iput-object p5, p0, Lh6/d$h;->g:Lh6/d;

    iput-object p6, p0, Lh6/d$h;->h:Lh6/h;

    iput-object p7, p0, Lh6/d$h;->i:Li6/i;

    iput-object p8, p0, Lh6/d$h;->j:Lw5/v;

    iput-object p9, p0, Lh6/d$h;->k:Lw5/t;

    iput-object p10, p0, Lh6/d$h;->l:Lw5/v;

    iput-object p11, p0, Lh6/d$h;->m:Lw5/v;

    iput-object p12, p0, Lh6/d$h;->n:Lw5/v;

    iput-object p13, p0, Lh6/d$h;->o:Lw5/v;

    invoke-direct {p0, p3, p4}, LX5/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lh6/d$h;->g:Lh6/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh6/d;->m()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    return-wide v0
.end method
