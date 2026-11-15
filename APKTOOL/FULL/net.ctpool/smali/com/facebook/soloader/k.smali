.class public abstract Lcom/facebook/soloader/k;
.super Lcom/facebook/soloader/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/soloader/k$a;,
        Lcom/facebook/soloader/k$b;
    }
.end annotation


# instance fields
.field protected final f:Ljava/io/File;

.field protected final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/soloader/C;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/facebook/soloader/k;->f:Ljava/io/File;

    iput-object p4, p0, Lcom/facebook/soloader/k;->g:Ljava/lang/String;

    return-void
.end method
